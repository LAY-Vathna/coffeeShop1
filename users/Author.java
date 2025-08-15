package users;

public class Author {
    public int id;
    public String userName;
    public String bio;
    public Author(int id, String userName, String bio) {
        this.id = id;
        this.userName = userName;
        this.bio = bio;
    }
    @Override
    public String toString() {
        return "Author [id=" + id + ", userName=" + userName + ", bio=" + bio + "]";
    }
    
}
