package module4.webinar.inter;

import module4.webinar.example.DeveloperEmployee;

/**
 * Created by Lenovo on 02.09.2016.
 */
public class DeveloperDB implements DBSERvise, Test {
    @Override
    public void save(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee developerEmployee) {

    }

    @Override
    public DeveloperEmployee[] getAllDev() {
        return new DeveloperEmployee[0];
    }

    @Override
    public void test() {

    }
}
