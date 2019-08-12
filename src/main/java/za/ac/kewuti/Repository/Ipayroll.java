package za.ac.kewuti.Repository;

public interface Ipayroll<T, ID> {

    T create (T t);
    T update (T t);
    void delete(ID id);
    T read(ID id);
}
