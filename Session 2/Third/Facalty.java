package com.company;

/**
 * The type Facalty.
 */
public class Facalty {
    /**
     *
     */
    private String name;
    private Lab[] labs;
    private String sessionInfo;

    /**
     * Instantiates a new Facalty.
     *
     * @param name the name
     */
    public Facalty(String name) {
        this.name = name;
    }

    /**
     * Get labs lab [ ].
     *
     * @return the lab [ ]
     */
    public Lab[] getLabs() {
        return labs;
    }

    /**
     * Sets labs.
     *
     * @param labs the labs
     */
    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    /**
     * Sets session info.
     *
     * @param sessionInfo the session info
     */
    public void setSessionInfo(String sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    /**
     * Gets session info.
     *
     * @return the session info
     */
    public String getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Check.
     *
     * @param u1 the u 1
     * @param u2 the u 2
     */
    public void check(Facalty u1, Facalty u2) {
        if (u1.name.equals(u2.name)) {
            System.out.println("there is a uni with same name");
        }
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Facalty f1 = new Facalty("AUT");
        Lab lab = new Lab(10, "1400/7/20");
        Lab lab2 = new Lab(20, "1400/7/27");
        Lab[] labs = new Lab[]{lab, lab2};
        f1.setLabs(labs);
        f1.setName("CE");
        f1.setSessionInfo("ArrayList");
        System.out.println("Name:" + f1.getName());
        System.out.println("Session name:" + f1.getSessionInfo());
        System.out.println(lab.getCapacity());
        System.out.println(lab2.getCapacity());
        System.out.println(lab.getDay());
        System.out.println(lab2.getDay());
    }
}
