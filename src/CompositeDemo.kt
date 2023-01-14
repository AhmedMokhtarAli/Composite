fun main() {
    val companyDirectory = CompanyDirectory()
    companyDirectory.addEmploee(Developer("ahmed mokhter","android developer",123456))
    companyDirectory.addEmploee(Developer("hassan saker","lawyer",98765876))
    companyDirectory.addEmploee(Developer("ibraheem shaban","engineer",1609876))


    companyDirectory.addEmploee(Maneger("ahmed mokhter","android tech-lead",123456))
    companyDirectory.addEmploee(Maneger("mo salah"," captain",123456))
    companyDirectory.addEmploee(Maneger("ahmed karim","manager",123456))

    val directory=CompanyDirectory()



    directory.addEmploee(companyDirectory)
    directory.addEmploee(Maneger("saleh ebeed","CEO",123456))
    directory.addEmploee(Developer("ibraheem saker","bisness man",98765876))

    directory.showEmploeeDetails()
    

}