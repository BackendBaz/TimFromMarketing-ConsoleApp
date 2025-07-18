class Badge {

    public String print(Integer id, String name, String department) {
        var departmentLabel = department == null ? "OWNER" : department.toUpperCase();
        if (id == null) return name + " - " + departmentLabel;
        return "[" + id + "] - " + name + " - " + departmentLabel;
    }

}
