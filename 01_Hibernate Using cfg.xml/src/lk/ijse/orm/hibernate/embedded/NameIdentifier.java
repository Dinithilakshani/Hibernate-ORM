package lk.ijse.orm.hibernate.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NameIdentifier {
    @Column (name ="first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String midddleName;
    @Column(name = "last_name")
    private String lastName;

    public NameIdentifier() {
        this.firstName = firstName;
        this.midddleName = midddleName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMidddleName(String midddleName) {
        this.midddleName = midddleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "NameIder{" +
                "firstName='" + firstName + '\'' +
                ", midddleName='" + midddleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getMidddleName() {
        return midddleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
