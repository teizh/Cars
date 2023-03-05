public enum WeaponType {
    SWORD("\u001B[34m");
   /* SMG("\u001B[34m"),
    GREEN("\u001B[32m");*/
   private String code;
    WeaponType(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
