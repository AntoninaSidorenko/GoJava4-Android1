package module4.webinar.inter;

import module4.webinar.example.DeveloperEmployee;

public interface DBSERvise {

    void save(DeveloperEmployee employee);

    DeveloperEmployee get(long id);

    void update(DeveloperEmployee developerEmployee);

    DeveloperEmployee[] getAllDev();
}
