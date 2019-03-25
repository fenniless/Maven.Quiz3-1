package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labList;
    private Lab lab;
    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labList = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab: labList) {
            if (labName.equals(lab.getName())){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for (Lab lab: labList) {
            if (labName.equals(lab.getName())){
                lab.setStatus(labStatus);
            }
        }
    }

    public void forkLab(Lab lab) {
        labList.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab: labList) {
            if (labName.equals(lab.getName())){
                return lab.getStatus();
            }
        }
        return null;
    }
}
