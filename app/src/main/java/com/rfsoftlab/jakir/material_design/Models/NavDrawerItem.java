package com.rfsoftlab.jakir.material_design.Models;

/**
 * @author Jakir Hossain
 * @version 1.3.0
 * @desc description of the class
 * @link n/a
 * @created on 29-Oct-15
 * @updated on
 * @modified by
 * @updated on
 * @since 1.0
 */
public class NavDrawerItem {
    private boolean showNotify;
    private String title;

    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title) {
       setShowNotify(showNotify);
        setTitle(title);
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
