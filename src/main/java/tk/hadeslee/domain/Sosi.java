package tk.hadeslee.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Project: spring-boot-hello-world
 * FileName: Sosi
 * Date: 2016-01-21
 * Time: 오후 5:58
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Sosi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name="sosi_id", referencedColumnName="id")
    private List<Schedule> scheduleList;

    public Sosi() {
    }

    public Sosi(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

}