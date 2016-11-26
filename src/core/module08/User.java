package core.module08;

public class User implements TypeWithId{
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public long getId() {
        return id;
    }
}
