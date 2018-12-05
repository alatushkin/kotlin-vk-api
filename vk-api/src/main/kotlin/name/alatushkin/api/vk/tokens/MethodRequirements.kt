package name.alatushkin.api.vk.tokens

interface MethodRequirement
interface UserMethod : MethodRequirement
interface GroupMethod : MethodRequirement
interface ServiceMethod : MethodRequirement
interface UserGroupMethod : UserMethod, GroupMethod
interface UserServiceMethod : UserMethod, ServiceMethod
interface UserGroupServiceMethod : UserGroupMethod, UserServiceMethod
