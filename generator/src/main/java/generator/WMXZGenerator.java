package generator;

import generator.dao.DaoGenerator;

public class WMXZGenerator {

    public static void main(String[] args) throws Exception {
        String project = "projects/wmxz";
        DaoGenerator.gen(project);
    }
}
