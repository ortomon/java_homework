package homework2.ex5.office;

public class Office {
    Boss boss;
    Manager manager;
    Security security;
    Secretary secretary;

    public Office(Boss boss, Manager manager, Security security, Secretary secretary) {
        this.boss = boss;
        this.manager = manager;
        this.security = security;
        this.secretary = secretary;
    }

    public void workDay() {
        boss.talk(boss.name);
        manager.talk();
        security.talk();
        secretary.talk(boss.name, manager.name, security.name);
    }
}
