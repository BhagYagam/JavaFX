package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private String id;
    private String name;
    private String address;
    private String dob;
    private String cnum;

    public Customer(String id, String name, String address, String title, String dob, String cnum) {
        this.id = id;
        this.name = title + name;
        this.address = address;
        this.dob = dob;
        this.cnum = cnum;
        Customer customer = new Customer(id,name,address,title,dob,cnum);
        System.out.println(customer);
    }

}
