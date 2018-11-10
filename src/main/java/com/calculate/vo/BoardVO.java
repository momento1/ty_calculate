package com.calculate.vo;

public class BoardVO {
    
    private int board_no;
    private String subject;
    private String content;
    private String writer;
    private String reg_date;
    
    private String USER_ID;
    private String PASSWORD;
    private String USER_NM;
    private String USE_YN;
    private String USER_LEVEL;
    private String USER_ORD;
    private String REG_DT;
    private String DEPT;
    private String EMAIL;
    private String ROLE;
    private String JOIN_DT;
    private String TEL1;
    private String TEL2;
    private String TEL3;
    private String ASSESSMENT;
    
    public int getBoard_no() {
        return board_no;
    }
    public void setBoard_no(int board_no) {
        this.board_no = board_no;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getReg_date() {
        return reg_date;
    }
    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }
    
    
    public String getUSER_ID() {
        return USER_ID;
    }
    public void setUSER_ID(String uSER_ID) {
        USER_ID = uSER_ID;
    }
    public String getPASSWORD() {
        return PASSWORD;
    }
    public void setPASSWORD(String pASSWORD) {
        PASSWORD = pASSWORD;
    }
    public String getUSER_NM() {
        return USER_NM;
    }
    public void setUSER_NM(String uSER_NM) {
        USER_NM = uSER_NM;
    }
    public String getUSE_YN() {
        return USE_YN;
    }
    public void setUSE_YN(String uSE_YN) {
        USE_YN = uSE_YN;
    }
    public String getUSER_LEVEL() {
        return USER_LEVEL;
    }
    public void setUSER_LEVEL(String uSER_LEVEL) {
        USER_LEVEL = uSER_LEVEL;
    }
    public String getUSER_ORD() {
        return USER_ORD;
    }
    public void setUSER_ORD(String uSER_ORD) {
        USER_ORD = uSER_ORD;
    }
    public String getREG_DT() {
        return REG_DT;
    }
    public void setREG_DT(String rEG_DT) {
        REG_DT = rEG_DT;
    }
    public String getDEPT() {
        return DEPT;
    }
    public void setDEPT(String dEPT) {
        DEPT = dEPT;
    }
    public String getEMAIL() {
        return EMAIL;
    }
    public void setEMAIL(String eMAIL) {
        EMAIL = eMAIL;
    }
    public String getROLE() {
        return ROLE;
    }
    public void setROLE(String rOLE) {
        ROLE = rOLE;
    }
    public String getJOIN_DT() {
        return JOIN_DT;
    }
    public void setJOIN_DT(String jOIN_DT) {
        JOIN_DT = jOIN_DT;
    }
    public String getTEL1() {
        return TEL1;
    }
    public void setTEL1(String tEL1) {
        TEL1 = tEL1;
    }
    public String getTEL2() {
        return TEL2;
    }
    public void setTEL2(String tEL2) {
        TEL2 = tEL2;
    }
    public String getTEL3() {
        return TEL3;
    }
    public void setTEL3(String tEL3) {
        TEL3 = tEL3;
    }
    public String getASSESSMENT() {
        return ASSESSMENT;
    }
    public void setASSESSMENT(String aSSESSMENT) {
        ASSESSMENT = aSSESSMENT;
    }
    @Override
    public String toString() {
        return "BoardVO [board_no=" + board_no + ", subject=" + subject + ", content=" + content + ", writer=" + writer
                + ", reg_date=" + reg_date + ", USER_ID=" + USER_ID + ", PASSWORD=" + PASSWORD + ", USER_NM=" + USER_NM
                + ", USE_YN=" + USE_YN + ", USER_LEVEL=" + USER_LEVEL + ", USER_ORD=" + USER_ORD + ", REG_DT=" + REG_DT
                + ", DEPT=" + DEPT + ", EMAIL=" + EMAIL + ", ROLE=" + ROLE + ", JOIN_DT=" + JOIN_DT + ", TEL1=" + TEL1
                + ", TEL2=" + TEL2 + ", TEL3=" + TEL3 + ", ASSESSMENT=" + ASSESSMENT + "]";
    }
    
    
}
