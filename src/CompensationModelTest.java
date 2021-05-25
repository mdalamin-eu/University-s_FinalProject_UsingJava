public class CompensationModelTest{
    public static void main(String[] args){


        // create four element Employee array
        Employee[] employees = new Employee[5];

        // initialise array with Employees


        employees[0] = new CommissionCompensationModel(
                "Ikther", "Nayeem", "333-33-3333", 10000.0f, .06f);
        employees[1] = new BasePlusCommissionCompensationModel(
                "Shakib", "Hasan", "444-44-4444", 5000.0f, .04f, 300.0f);
        employees[2] = new SalariedCompensationModel(
                "Bishal", "Thapa", "111-11-1111", 800.0f);
        employees[3] = new HourlyCompensationModel(
                "Jakko", "khan", "222-22-2222", 16.75f, 40.0f);
        employees[4] = new HourlyCompensationModel(
                "Alamin", "Md", "555-55-5555", 16.75f, 50.0f);

        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            // determine whether element is a BasePlusCommissionEmployee
            if(currentEmployee instanceof BasePlusCommissionCompensationModel){
                // downcase Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionCompensationModel employee =
                        (BasePlusCommissionCompensationModel) currentEmployee;

                employee.setBaseSalary(1.10f * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());


            }


        }

        // get type name of each object in employee array
        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}