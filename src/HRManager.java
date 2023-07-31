public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    // Add junior developer to the juniorDevelopers array
    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                System.out.println("Junior Developer " + juniorDeveloper.getName() + " added to juniorDevelopers.");
                return;
            }
        }
        System.out.println("No more space for Junior Developers.");
    }

    // Add mid developer to the midDevelopers array
    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                System.out.println("Mid Developer " + midDeveloper.getName() + " added to midDevelopers.");
                return;
            }
        }
        System.out.println("No more space for Mid Developers.");
    }

    // Add senior developer to the seniorDevelopers array
    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                System.out.println("Senior Developer " + seniorDeveloper.getName() + " added to seniorDevelopers.");
                return;
            }
        }
        System.out.println("No more space for Senior Developers.");


    }
}
