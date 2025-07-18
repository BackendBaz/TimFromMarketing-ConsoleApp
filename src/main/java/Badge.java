class Badge {

    public String print(Integer id, String name, String department) {
        if (id == null) return name + " - " + department.toUpperCase();
        return "[" + id + "] - " + name + " - " + department.toUpperCase();
    }

}
