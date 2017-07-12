package com.hframe.domain.model;

public class HfpmTest {
    private Long hfpmTestId;

    private String hfpmTestCode;

    private String hfpmTestName;

    private Long hfpmProgramCfgId;

    private Long hfcfgProgramTemplateId;

    public HfpmTest(Long hfpmTestId, String hfpmTestCode, String hfpmTestName, Long hfpmProgramCfgId, Long hfcfgProgramTemplateId) {
        this.hfpmTestId = hfpmTestId;
        this.hfpmTestCode = hfpmTestCode;
        this.hfpmTestName = hfpmTestName;
        this.hfpmProgramCfgId = hfpmProgramCfgId;
        this.hfcfgProgramTemplateId = hfcfgProgramTemplateId;
    }

    public Long getHfpmTestId() {
        return hfpmTestId;
    }

    public String getHfpmTestCode() {
        return hfpmTestCode;
    }

    public String getHfpmTestName() {
        return hfpmTestName;
    }

    public Long getHfpmProgramCfgId() {
        return hfpmProgramCfgId;
    }

    public Long getHfcfgProgramTemplateId() {
        return hfcfgProgramTemplateId;
    }

    public void setHfpmTestId(Long hfpmTestId) {
        this.hfpmTestId=hfpmTestId;
    }

    public void setHfpmTestCode(String hfpmTestCode) {
        this.hfpmTestCode=hfpmTestCode;
    }

    public void setHfpmTestName(String hfpmTestName) {
        this.hfpmTestName=hfpmTestName;
    }

    public void setHfpmProgramCfgId(Long hfpmProgramCfgId) {
        this.hfpmProgramCfgId=hfpmProgramCfgId;
    }

    public void setHfcfgProgramTemplateId(Long hfcfgProgramTemplateId) {
        this.hfcfgProgramTemplateId=hfcfgProgramTemplateId;
    }

    public HfpmTest() {
        super();
    }
}