package tk.hadeslee.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Project: spring-boot-hello-world
 * FileName: User
 * Date: 2016-01-21
 * Time: 오후 3:03
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}