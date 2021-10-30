CREATE TABLE IF NOT EXISTS users (
                        id SERIAL PRIMARY KEY,
                        username TEXT NOT NULL,
                        password INT NOT NULL,
                        email TEXT,
                        role TEXT,
                        createDate TIMESTAMP
);

