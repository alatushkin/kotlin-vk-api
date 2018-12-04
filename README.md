# kotlin-vk-api

API вконтакте сгенерированное на основе [схемы](https://github.com/VKCOM/vk-api-schema) с исправленными ошибками c поддержкой корутин.

Gradle:
```
repositories {
    maven {
        url  "https://dl.bintray.com/alatushkin/maven" 
    }
}
...
dependencies {
        implementation("name.alatushkin.utils:kotlin-vk-api:0.1")
    }
```

Пример вызова метода:
```
val userAccessToken = "sooo_secret
val httpClient = httpClient()
val api = MethodExecutorImpl(httpClient).withToken(userAccessToken)

val (response,error) = api(WallGetMethod(domain = "departureMsk"))
println(response)
println(error)
```

Выполнение до 25 одинаковых методов за один вызов:
```
val methodFactory = { page: Long -> WallGetMethod(domain = "departureMsk",offset = page,count = 100)}
val result: Array<VkList<WallpostFull>> = api((0..24L).map(methodFactory))
```
Под капотом генерируется код на VKScript и выполняется через метод "execute". В документации VK отмечается, что API методов внутри VKScript может не совпадать с внешним API. Так что всегда есть шанс, что для каких-то методов универсальный генератор работать не будет. Если встретитесь с таким - заведите isssue с подробностями.


Особенности кода:
API устроен таким образом, что один и тот же метод может возвращать объекты рахных типов, в зависимости от переданных параметров. При этом хочется типизации и не хочется null-checking (some?.nullableParam). 

В таких случаях для одного api-endpoint сгенерировано 2 (более методов) с соответсвующими суффиксами в именовании + жестко заданными знаечниями управляющих параметров.
Для пример:
```
val result:VkResponse<VkList<WallpostFull>> = api(WallGetMethod(domain = "departureMsk"))
val resultExtended:VkResponse<GetExtendedResponse> = api(WallGetMethodExtended(domain = "departureMsk"))
```

## Как внести свой вклад
### Дополнения и исправления в схеме (json)
Т.к. оригинальная схема написана неряшливо, каких-то планов по ее регулярной поддержке не озвучено, то в проекте она хранится в следующем виде:

1. [Оригинальный набор файлов](https://github.com/alatushkin/kotlin-vk-api/tree/master/generator/src/main/resources/schema) - сюда принимаются только минорные PR: флаги обязательности полей, потерянные поля, комментарии. Когда ВК обновит своб схему - сделать мерж будет "просто".

2. Набор [патчей](https://github.com/alatushkin/kotlin-vk-api/tree/master/generator/src/main/resources/patch) - концептуальные ошибки в объявлении тех или иных методов, необъявленные типы объектов и прочее. Сюда можно присылать PR для отсутсвующих объектов методов и прочее.

### Доработки кодо-генерации
Кодогенерация живет [в отдельном подпроекте](https://github.com/alatushkin/kotlin-vk-api/tree/master/generator).

### Доработки сопутствующего кода
Попмимо сгенерированного кода, присутсвует и некая часть вспомогательного кода, который так же нуждается в улучшениях.

Если у вас есть идеи или предложения - напишите мне в ЛС или на alexandr.latushkin@gmail.com

Что "нужно" уже сейчас:
1. HttpClient - сейчас написан поверх jre. Если найдутся желающие реализовать его с использованием ktor - будет здорово (выше эффективность + шаг в сторону кросс-платформенного vk-api-client -  на js у людей тоже проблемы с актуальностью)
2. Заменить на что-то Jackson и перевести проект на мультиплатформенную сборку
3. Доработать кодогенерацию для генерации VK-подобного api  (WallGetMethod => wall.get  с правильными областями видимости, чтобы не засорять неймспейс)
4. Выделить кодо-генерацию и сделать автоматическую сборку через travis-ci при исправлении в json-схеме
5. Посмотреть как видится в чистой java, возможно с небольшими доработками этим можно будет удобно пользовться и из java


Статус - работает "как есть". Те методы который использую в своих проектах - проверены, но вполне могут быть методы в схеме описания которых ошибка из-за чего они могту не работать - заводите issue, прикладывайте pr в схему









