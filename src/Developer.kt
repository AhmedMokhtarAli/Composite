class Developer(val name:String,val postion:String,val empId:Long): Emploee {
    override fun showEmploeeDetails() {
        println("$name $postion")
    }
}