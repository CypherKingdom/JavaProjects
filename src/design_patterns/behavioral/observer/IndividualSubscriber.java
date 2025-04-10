package design_patterns.behavioral.observer;

public class IndividualSubscriber implements Subscriber {
    private String name;

    public IndividualSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " is reading the news: " + news);
    }
}
