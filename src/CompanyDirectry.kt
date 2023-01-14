class CompanyDirectory : Emploee {
    val empList:ArrayList<Emploee> =ArrayList<Emploee>()
    override fun showEmploeeDetails() {
        for (emp in empList){
            emp.showEmploeeDetails()
        }
    }
    fun addEmploee(emploee: Emploee){
        empList.add(emploee)
    }
    fun removeEmp(emploee: Emploee){
        empList.remove(emploee)
    }
}