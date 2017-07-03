package vn.com.ntq.ntqsocialnetwork.entities;

import java.io.Serializable;
import java.util.Date;

import vn.com.ntq.ntqsocialnetwork.common.Utils;

public class TblReportDemoEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5375936703809659705L;
    private String mediaName;
    private Date timeReport;
    private Integer totalApplicants;
    private String timeReportJpStr;

    public TblReportDemoEntity() {
        super();
    }

    public TblReportDemoEntity(String mediaName, String timeReportJpStr, Integer totalApplicants) {
        super();
        this.mediaName = mediaName;
        this.timeReportJpStr = timeReportJpStr;
        this.totalApplicants = totalApplicants;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public Date getTimeReport() {
        return timeReport;
    }

    public void setTimeReport(Date timeReport) {
        this.timeReport = timeReport;
    }

    public Integer getTotalApplicants() {
        return totalApplicants;
    }

    public void setTotalApplicants(Integer totalApplicants) {
        this.totalApplicants = totalApplicants;
    }

    public String getTimeReportJpStr() {
        return timeReportJpStr;
    }

    public void setTimeReportJpStr(String timeReportJpStr) {
        this.timeReportJpStr = timeReportJpStr;
    }

    public String getReportDateJP() {
        if (timeReport != null) {
            return Utils.dateToStringJp(timeReport);
        } else {
            return timeReportJpStr;
        }
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
