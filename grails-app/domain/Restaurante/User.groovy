//package Restaurante
//
//import grails.plugin.springsecurity.SpringSecurityService
//import groovy.transform.EqualsAndHashCode
//import groovy.transform.ToString
//import grails.compiler.GrailsCompileStatic
//
//@GrailsCompileStatic
//@EqualsAndHashCode(includes='username')
//@ToString(includes='username', includeNames=true, includePackage=false)
//class User implements Serializable {
//
//	private static final long serialVersionUID = 1
//
//	SpringSecurityService springSecurityService
//
//	String username
//	String password
//	boolean enabled = true
//	boolean accountExpired
//	boolean accountLocked
//	boolean passwordExpired
//
//	// Retorna os papéis (autoridades) atribuídos ao usuário
//	Set<Role> getAuthorities() {
//		(UserRole.findAllByUser(this) as List<UserRole>)*.role as Set<Role>
//	}
//
//	// Codifica a senha antes de inserir o usuário no banco de dados
//	def beforeInsert() {
//		encodePassword()
//	}
//
//	// Codifica a senha somente se ela tiver sido modificada antes de atualizar o usuário
//	def beforeUpdate() {
//		if (isDirty('password')) {
//			encodePassword()
//		}
//	}
//
//	// Codifica a senha utilizando o serviço de segurança, se disponível
//	protected void encodePassword() {
//		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
//	}
//
//	// Define 'springSecurityService' como transiente, pois não deve ser persistido no banco de dados
//	static transients = ['springSecurityService']
//
//	static constraints = {
//		password nullable: false, blank: false, password: true
//		username nullable: false, blank: false, unique: true
//	}
//
//	static mapping = {
//		// Nome da coluna 'password' é protegido com acentos graves para evitar problemas com palavras reservadas
//		password column: '`password`'
//	}
//}
