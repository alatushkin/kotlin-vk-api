package name.alatushkin.api.vk.tokens

/**
 * The method is available with an access token of some (matching) kind.
 * However, the exact types of supported access tokens are unknown.
 */
interface MethodRequirement


/**
 * The method is available either with a "user" or "group" access token (but probably not both)
 */
interface UserOrGroupMethod : MethodRequirement


/**
 * The method is available at least for a "user"
 */
interface UserMethod : UserOrGroupMethod

/**
 * The method is available at least for a "group"
 */
interface GroupMethod : UserOrGroupMethod

/**
 * The method is available at least for a "service"
 */
interface ServiceMethod : MethodRequirement

/**
 * The method is available at least for a "user" and for a "group"
 */
interface UserGroupMethod : UserMethod, GroupMethod

/**
 * The method is available at least for a "user" and for a "service"
 */
interface UserServiceMethod : UserMethod, ServiceMethod

/**
 * The method is available at least for a "user" and for a "group" and for a "service"
 */
interface UserGroupServiceMethod : UserGroupMethod, UserServiceMethod
