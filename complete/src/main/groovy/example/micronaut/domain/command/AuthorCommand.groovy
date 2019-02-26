package example.micronaut.domain.command

class AuthorCommand {
    String name

    def dynamicProperties= [:]
    //setter
    def propertyMissing(String name, value) { dynamicProperties[name] = value }
    //getter
    def propertyMissing(String name) { dynamicProperties= [name] }

    @Override
    public String toString() {
        return "AuthorCommand{" +
                "name='" + name + '\'' +
                ", dynamicProperties=" + dynamicProperties +
                '}';
    }
}
