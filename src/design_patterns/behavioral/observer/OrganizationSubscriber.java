package design_patterns.behavioral.observer;

public class OrganizationSubscriber implements Subscriber {
    private String name;

    public OrganizationSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " organization is spreading the news: " + news);
    }    
}
