package module6.practice;

public class DAOImpl implements DAO{
    @Override
    public Order save(Order order) {
        System.out.println(order + "saved");
        return order;
    }
}
