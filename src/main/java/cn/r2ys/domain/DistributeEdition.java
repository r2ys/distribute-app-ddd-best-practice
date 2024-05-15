package cn.r2ys.domain;


public class DistributeEdition {

    private Long id;

    private DistributeApp app;
    private DistributeAppSys appSys;
    private DistributeBranch branch;
    private Qrcode qrcode;

    private List<DistributeUpload> uploadList;
    private DistributeUpload newestUpload;
}
