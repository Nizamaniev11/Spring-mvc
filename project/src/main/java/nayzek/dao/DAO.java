package nayzek.dao;

public interface DAO<T> {

	void create(T object);

	T read(int id);

	void update(T object);

	void delete(int id);

}
