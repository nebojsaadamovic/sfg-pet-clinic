package guru.springframework.sfgpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class  AbstractMapService<Owner ,Long> {

   Map <ID,T> map=new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save (ID id, T object){
        map.put(id,object);
        return  object;
    }

    void deleteById(ID id){
        return map.remove(id);
    }


      void  delete( T object){
        return map.entrySet().removeIf(entry -> entry.getValue().equals(object));
       }



}
