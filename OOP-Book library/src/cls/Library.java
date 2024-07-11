package cls;

import java.util.ArrayList;

public class Library {
    private ArrayList<Section> sections;

    public Library(ArrayList<Section> sections) {
        setSections(sections);
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Library{" +
                "sections=" + sections +
                '}';
    }
}
