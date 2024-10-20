//
//
//// Added by the Spring Security Core plugin:
//grails.plugin.springsecurity.userLookup.userDomainClassName = 'Restaurante.User'
//grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'Restaurante.UserRole'
//grails.plugin.springsecurity.authority.className = 'Restaurante.Role'
//
//grails.plugin.springsecurity.auth.loginFormUrl = '/areaRestrita/logar'
//grails.plugin.springsecurity.logout.afterLogoutUrl = '/areaRestrita/logout'
//grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/areaRestrita/admin'
//grails.plugin.springsecurity.failureHandler.defaultFailureUrl = '/areaRestrita/erro'
//grails.plugin.springsecurity.successHandler.alwaysUseDefault = false
//grails.plugin.springsecurity.dao.hideUserNotFoundExceptions = false
//grails.plugin.springsecurity.adh.errorPage = '/spring_security_logout'
//grails.plugin.springsecurity.password.algorithm = 'SHA-256'
//
//grails.plugin.springsecurity.securityConfigType = "InterceptUrlMap"
//grails.plugin.springsecurity.interceptUrlMap = [
//		[pattern: '/areaRestrita/logar', access: ['permitAll']],
//		[pattern: '/areaRestrita/logout', access: ['permitAll']],
//		[pattern: '/admin/**',   access: ['ROLE_ADMIN']],
//		[pattern: '/user/**',    access: ['ROLE_USER']],
//		[pattern: '/public/**',  access: ['IS_AUTHENTICATED_ANONYMOUSLY']]
//]
//grails.plugin.springsecurity.filterChain.chainMap = [
//		[pattern: '/assets/**',      filters: 'none'],
//		[pattern: '/**/js/**',       filters: 'none'],
//		[pattern: '/**/css/**',      filters: 'none'],
//		[pattern: '/**/images/**',   filters: 'none'],
//		[pattern: '/**/favicon.ico', filters: 'none'],
//		[pattern: '/**',             filters: 'JOINED_FILTERS']  // Certifique-se que os filtros estão corretos aqui
//]
//
//
//grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//	[pattern: '/',               access: ['permitAll']],
//	[pattern: '/areaRestrita/logar', access: ['permitAll']],
//	[pattern: '/error',          access: ['permitAll']],
//	[pattern: '/index',          access: ['permitAll']],
//	[pattern: '/index.gsp',      access: ['permitAll']],
//	[pattern: '/shutdown',       access: ['permitAll']],
//	[pattern: '/assets/**',      access: ['permitAll']],
//	[pattern: '/**/js/**',       access: ['permitAll']],
//	[pattern: '/**/css/**',      access: ['permitAll']],
//	[pattern: '/**/images/**',   access: ['permitAll']],
//	[pattern: '/**/favicon.ico', access: ['permitAll']]
//]
//
//grails.plugin.springsecurity.filterChain.chainMap = [
//	[pattern: '/assets/**',      filters: 'none'],
//	[pattern: '/**/js/**',       filters: 'none'],
//	[pattern: '/**/css/**',      filters: 'none'],
//	[pattern: '/**/images/**',   filters: 'none'],
//	[pattern: '/**/favicon.ico', filters: 'none'],
//	[pattern: '/**',             filters: 'JOINED_FILTERS']
//]
//
