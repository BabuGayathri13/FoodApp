
create Database project2;
show databases;
use project2;
CREATE TABLE Menu (
    MenuID INT PRIMARY KEY,
    Cuisine VARCHAR(50) NOT NULL,
    MenuName VARCHAR(100) NOT NULL,
    Ingredients TEXT NOT NULL,
    Method TEXT NOT NULL
);


-- Indian Cuisine

INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (1, 'Indian', 'Chicken Curry', 'Chicken, onions, tomatoes, garlic, ginger, curry spices. Sauté onions, garlic, and ginger. Add tomatoes and spices. Cook chicken until done.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (2, 'Indian', 'Vegetable Samosas', 'Potatoes, peas, carrots, spices, samosa wrappers. Boil and mash potatoes, mix with peas, carrots, and spices. Fill samosa wrappers and deep-fry.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (3, 'Indian', 'Palak Paneer', 'Spinach, paneer, onions, tomatoes, spices', 'Sauté onions, tomatoes, and spices. Add spinach and paneer. Cook until spinach wilts.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (4, 'Indian', 'Dal Tadka', 'Lentils, onions, tomatoes, cumin seeds, spices', 'Cook lentils, temper with cumin seeds, sauté onions and tomatoes, mix together.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (5, 'Indian', 'Aloo Gobi', 'Potatoes, cauliflower, onions, tomatoes, spices', 'Sauté onions, tomatoes, and spices. Add potatoes and cauliflower. Cook until tender.');

-- Chinese Cuisine
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (6, 'Chinese', 'Beef and Broccoli Stir-Fry', 'Beef strips, broccoli, soy sauce, garlic, ginger', 'Stir-fry beef with garlic and ginger. Add broccoli and soy sauce. Cook until tender.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (7, 'Chinese', 'Egg Fried Rice', 'Cooked rice, eggs, vegetables, soy sauce.', 'Scramble eggs, add cooked rice and vegetables. Stir in soy sauce.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (8, 'Chinese', 'Kung Pao Chicken', 'Chicken, peanuts, bell peppers, soy sauce, chili peppers.','Stir-fry chicken with peanuts, bell peppers, and a spicy sauce.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (9, 'Chinese', 'Vegetable Chow Mein', 'Noodles, mixed vegetables, soy sauce, sesame oil.',' Boil noodles, stir-fry mixed vegetables, toss with soy sauce and sesame oil.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (10, 'Chinese', 'Hot and Sour Soup', 'Chicken or tofu, mushrooms, bamboo shoots, vinegar, chili,','Cook ingredients in a broth with vinegar and chili for a hot and sour flavor.');

-- Nigerian Cuisine
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (11, 'Nigerian', 'Jollof Rice', 'Parboiled rice, tomatoes, onions, bell peppers, chicken broth.', 'Cook rice with blended tomatoes, onions, and bell peppers. Add chicken broth for flavor.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (12, 'Nigerian', 'Fried Plantains with Pepper Sauce', 'Ripe plantains, bell peppers, onions, tomatoes.','Slice and fry plantains. Sauté bell peppers, onions, and tomatoes for a spicy sauce.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (13, 'Nigerian', 'Efo Riro', 'Spinach, tomatoes, peppers, onions, palm oil.',' Sauté onions, tomatoes, and peppers in palm oil. Add spinach and cook.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (14, 'Nigerian', 'Suya', 'Thinly sliced beef, groundnut spice mix.,',' Coat beef in spice mix and grill or roast until flavorful.');
INSERT INTO Menu (MenuID, Cuisine, MenuName, Ingredients, Method) VALUES (15, 'Nigerian', 'Akara', 'Black-eyed peas, onions, peppers, spices.',' Blend, mix with onions and spices. Deep-fry into small cakes.');
Select * from menu;