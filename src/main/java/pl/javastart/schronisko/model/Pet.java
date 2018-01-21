package pl.javastart.schronisko.model;

public class Pet {

    private String name;
    private String description;
    private String descriptionLorem;
    private String petURL;

    public Pet(String name, String description) {
        this.name = name;
        this.description = description;
        this.descriptionLorem =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        this.petURL = name + ".html";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionLorem() {
        return descriptionLorem;
    }

    public void setDescriptionLorem(String descriptionLorem) {
        this.descriptionLorem = descriptionLorem;
    }

    public String getPetURL() {
        return petURL;
    }

    public void setPetURL(String petURL) {
        this.petURL = petURL;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", descriptionLorem='" + descriptionLorem + '\'' +
                '}';
    }
}
