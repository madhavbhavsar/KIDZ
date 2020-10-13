package edu.madappsdevlopers.kidz;

public class StoryModel {
    private String name;
    private String pic;
    //i aded
    private String sdata;

    private boolean expanded;

    public StoryModel(String name, String pic, String sdata) {
        this.name = name;
        this.pic = pic;
        this.sdata = sdata;

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
    public String getSdata() {
        return sdata;
    }

    public void setSdata(String sdata) {
        this.sdata = sdata;
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
                ", storydata='" + sdata + '\'' +
                //

                ", expanded=" + expanded +
                '}';
    }

}
