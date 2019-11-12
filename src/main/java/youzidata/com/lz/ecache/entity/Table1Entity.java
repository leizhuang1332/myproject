package youzidata.com.lz.ecache.entity;

public class Table1Entity {
    private int id;
    private String column_1;
    private String column_2;
    private String column_3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColumn_1() {
        return column_1;
    }

    public void setColumn_1(String column_1) {
        this.column_1 = column_1;
    }

    public String getColumn_2() {
        return column_2;
    }

    public void setColumn_2(String column_2) {
        this.column_2 = column_2;
    }

    public String getColumn_3() {
        return column_3;
    }

    public void setColumn_3(String column_3) {
        this.column_3 = column_3;
    }

    @Override
    public String toString() {
        return "Table1Entity{" +
                "id=" + id +
                ", column_1='" + column_1 + '\'' +
                ", column_2='" + column_2 + '\'' +
                ", column_3='" + column_3 + '\'' +
                '}';
    }
}
