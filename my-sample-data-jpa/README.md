
QueryDslJpaRepository(类)-->SimpleJpaRepository(类)-->JpaRepository-->(接口)PagingAndSortingRepository(接口)-->CrudRepository(接口)-->Repository(接口)

Repository 空接口
(org.springframework.data.repository.Repository)

CrudRepository 方法:
(org.springframework.data.repository.CrudRepository)
<S extends T> S save(S entity);
<S extends T> Iterable<S> save(Iterable<S> entities);
T findOne(ID id);
boolean exists(ID id);
Iterable<T> findAll();
Iterable<T> findAll(Iterable<ID> ids);
long count();
void delete(ID id);
void delete(T entity);
void delete(Iterable<? extends T> entities);
void deleteAll();

PagingAndSortingRepository 方法:
(org.springframework.data.repository.PagingAndSortingRepository)
Iterable<T> findAll(Sort sort);
Page<T> findAll(Pageable pageable);

JpaRepository 方法:
(org.springframework.data.jpa.repository.JpaRepository)
List<T> findAll();
List<T> findAll(Sort sort);
List<T> findAll(Iterable<ID> ids);
<S extends T> List<S> save(Iterable<S> entities);
void flush();
<S extends T> S saveAndFlush(S entity);
void deleteInBatch(Iterable<T> entities);
void deleteAllInBatch();
T getOne(ID id);

SimpleJpaRepository 方法:
(org.springframework.data.jpa.repository.support.SimpleJpaRepository)
...

QueryDslJpaRepository 方法:
org.springframework.data.jpa.repository.support.QueryDslJpaRepository
...
