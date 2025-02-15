"# To-Do List Projesi" 
# 📒 To-Do List Projesi

Bu proje, Spring Boot kullanılarak oluşturulmuş bir **To-Do List API** uygulamasıdır.  
Postman üzerinden CRUD işlemleri yapılabilir:
- 🟢 `GET /tasks` – Tüm görevleri listele  
- 🟡 `POST /tasks` – Yeni görev ekle  
- 🟠 `PUT /tasks/{id}` – Görev güncelle  
- 🔴 `DELETE /tasks/{id}` – Görev sil  

## 🚀 Kullanılan Teknolojiler:
- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database  
- Postman  

## 📂 Projeyi Çalıştırma:
```bash
git clone https://github.com/kullaniciadi/todo-list.git
cd todo-list
./mvnw spring-boot:run
