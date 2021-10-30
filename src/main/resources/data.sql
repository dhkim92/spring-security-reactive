truncate table users;

INSERT INTO users('id', 'username', 'password', 'email', 'role', 'createDate')
values (1, 'User no 1', 'user1', 'user1@users.com', 'USER', 'today'),
       (2, 'User no 2', 'user2', 'user2@users.com', 'USER', 'today'),
       (3, 'User no 3', 'user3', 'user3@users.com', 'USER', 'today'),
       (4, 'User no 4', 'user4', 'user4@users.com', 'USER', 'today');