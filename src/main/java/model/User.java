package model;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {
//    public static void main(String[] args) {
//        System.out.println("Bowen is awesome!");
//    }
    private long id;
    private String name;
    private String email;

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setId(long id){
        this.id = id;
    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    private void setName(String name){
        this.name = name;
    }

    private void setEmail(String email){
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, email);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        User other = (User) obj;
//        if(id!=other.id){
//            return false;
//        }
        if(!email.equals(other.email)){
            return false;
        }
        if(!name.equals(other.name)){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        User user1 = new User("Bws","bshen36@gwu.edu");
        User user2 = new User("Cyt","yutong@gwu.edu");
        User user3 = new User("Bws","bshen36@gwu.edu");
        Map<User, Integer> m = new HashMap<>();
        m.put(user1, 1);
        m.put(user2, 2);
        m.put(user3, 2);
        System.out.println(m.size());
        System.out.println( m.get(user1));
        System.out.println(m.get(user3));
    }
}
