package mysample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by fuwb on 16/7/23.
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = true)
    private String userName;

    @Column(nullable = true)
    private Integer age;

    @Column(nullable = true)
    private Date birthday;

    @Column(nullable = true)
    private Date createTime;

    //@OneToMany
    //ManyToOne

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
