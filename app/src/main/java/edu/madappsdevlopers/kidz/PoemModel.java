package edu.madappsdevlopers.kidz;

public class PoemModel {
    private String name;
    private String pic;
    //i aded
    private String pdata;

    private boolean expanded;

    public PoemModel(String name, String pic, String pdata) {
        this.name = name;
        this.pic = pic;
        this.pdata = pdata;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    //i aded
    public String getPdata() {
        return pdata;
    }

    public void setPdata(String pdata) {
        this.pdata = pdata;
    }//

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "PoemModel{" +
                "name='" + name + '\'' +
                ", pic='" + pic + '\'' +

                //iaded
                ", poemdata='" + pdata + '\'' +
                //

                ", expanded=" + expanded +
                '}';
    }

}
