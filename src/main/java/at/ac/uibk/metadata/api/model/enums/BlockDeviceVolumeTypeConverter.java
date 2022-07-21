package at.ac.uibk.metadata.api.model.enums;

public class BlockDeviceVolumeTypeConverter implements DbConverter {

    @Override
    public Object from(String dbValue) {
        return dbValue != null ? BlockDeviceType.valueOf(dbValue) : null;
    }

    @Override
    public String to(Object object) {
        return object != null ? object.toString() : null;
    }
}
