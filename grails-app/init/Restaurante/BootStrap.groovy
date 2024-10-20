//package Restaurante
//
//class BootStrap {
//
//    def init = { servletContext ->
//
//        // Verificando e criando o Role ADMIN, se necessário
//        Role admin = Role.findByAuthority("ROLE_ADMIN")
//        if (admin == null) {
//            admin = new Role(authority: "ROLE_ADMIN").save(flush: true)
//        }
//
//        // Verificando e criando o Role BALCAO, se necessário
//        Role balcao = Role.findByAuthority("ROLE_BALCAO")
//        if (balcao == null) {
//            balcao = new Role(authority: "ROLE_BALCAO").save(flush: true)
//        }
//
//        // Verificando e criando o User administrador, se necessário
//        User administrador = User.findByUsername("administrador")
//        if (administrador == null) {
//            administrador = new User(username: "administrador", password: "123",
//                    accountExpired: false, accountLocked: false, passwordExpired: false)
//                    .save(flush: true)
//        }
//
//        // Verificando e criando o User balconista, se necessário
//        User balconista = User.findByUsername("balconista")
//        if (balconista == null) {
//            balconista = new User(username: "balconista", password: "123",
//                    accountExpired: false, accountLocked: false, passwordExpired: false)
//                    .save(flush: true)
//        }
//
//        // Verificando se a relação entre UserRole e Role do administrador existe
//        if (UserRole.findByUserAndRole(administrador, admin) == null) {
//            new UserRole(user: administrador, role: admin).save(flush: true)
//        }
//
//        // Verificando se a relação entre UserRole e Role do balconista existe
//        if (UserRole.findByUserAndRole(balconista, balcao) == null) {
//            new UserRole(user: balconista, role: balcao).save(flush: true)
//        }
//    }
//
//    def destroy = {
//    }
//}
