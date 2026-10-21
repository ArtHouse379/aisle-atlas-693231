package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.repository

import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.model.Product
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf<Product>(
        Product(
            id = 1,
            title = "Ceramic Dinner Plate",
            description = "A smooth ceramic plate sized for everyday lunches and dinners. Its neutral finish pairs easily with existing table settings. The raised rim helps keep sauces and crumbs contained. It is suitable for serving at home or stocking a small hospitality table.",
            category = ProductCategory.TABLEWARE,
            price = 6.50,
            imageUrl = "https://images.unsplash.com/photo-1620296595801-3cd364a12807",
        ),
        Product(
            id = 2,
            title = "Glass Tumbler",
            description = "A clear glass tumbler for water, juice, and everyday cold drinks. The straight-sided shape is comfortable to hold and easy to match with other glassware. Its simple design works for family meals or casual entertaining. The glass can be reused throughout the day.",
            category = ProductCategory.TABLEWARE,
            price = 4.25,
            imageUrl = "https://images.unsplash.com/photo-1610821165540-80c084d50fd3",
        ),
        Product(
            id = 3,
            title = "Stainless Steel Cutlery Set",
            description = "A practical stainless steel cutlery set for daily meals. The polished pieces have balanced handles and a clean, timeless profile. Durable steel stands up well to frequent use and washing. The set is a useful choice for a new kitchen or replacement place setting.",
            category = ProductCategory.TABLEWARE,
            price = 14.99,
            imageUrl = "https://images.unsplash.com/photo-1592065849768-c899a42f8088",
        ),
        Product(
            id = 4,
            title = "Cotton Bath Towel",
            description = "A soft cotton bath towel made for everyday drying. The absorbent weave feels comfortable against the skin and dries reliably after use. Neatly finished edges help it hold its shape through regular washing. It is a practical addition to family bathrooms, guest rooms, or rental properties.",
            category = ProductCategory.HOME_TEXTILES,
            price = 12.00,
            imageUrl = "https://images.unsplash.com/photo-1766727923581-d4df2f4e9308",
        ),
        Product(
            id = 5,
            title = "Throw Pillow",
            description = "A decorative throw pillow that adds comfort to a sofa, chair, or bed. Its versatile shape supports the back while softening the look of a room. The understated style coordinates with a wide range of home textiles. Use it alone or combine several for a layered seating area.",
            category = ProductCategory.HOME_TEXTILES,
            price = 16.50,
            imageUrl = "https://images.unsplash.com/photo-1572572610498-5116f64dabb2",
        ),
        Product(
            id = 6,
            title = "Woven Blanket",
            description = "A warm woven blanket for beds, sofas, and reading chairs. The textured fabric provides an extra layer on cool evenings without feeling overly bulky. Fold it away neatly when it is not in use. Its adaptable design suits bedrooms, living spaces, and guest accommodation.",
            category = ProductCategory.HOME_TEXTILES,
            price = 28.00,
            imageUrl = "https://images.unsplash.com/photo-1633943927975-391a217c7c44",
        ),
        Product(
            id = 7,
            title = "Spiral Notebook",
            description = "A spiral notebook for lists, lessons, meeting notes, and sketches. The binding lets pages lie flat while you write. Ruled paper keeps everyday notes tidy and easy to review. It fits naturally into a school bag, office drawer, or home workspace.",
            category = ProductCategory.STATIONERY,
            price = 3.75,
            imageUrl = "https://images.unsplash.com/photo-1523635050353-f5b60dafa07c",
        ),
        Product(
            id = 8,
            title = "Ballpoint Pen",
            description = "A dependable ballpoint pen for quick notes and longer writing tasks. The smooth ink flow produces clear lines with minimal smudging. Its lightweight barrel is comfortable for regular use at school, home, or work. Keep one close by for forms, labels, and daily planning.",
            category = ProductCategory.STATIONERY,
            price = 1.50,
            imageUrl = "https://images.unsplash.com/photo-1571385761910-b876ab0b46a6",
        ),
        Product(
            id = 9,
            title = "Colored Pencils",
            description = "A bright set of colored pencils for drawing, colouring, and classroom projects. The varied shades make it easy to add detail and contrast to creative work. Sharpened wooden barrels offer familiar control for children and adults. The set is useful for school supplies, craft tables, and quiet play.",
            category = ProductCategory.STATIONERY,
            price = 5.99,
            imageUrl = "https://images.unsplash.com/photo-1522111608460-19e7331e00fb",
        ),
        Product(
            id = 10,
            title = "Wooden Building Blocks",
            description = "A set of wooden building blocks for stacking, sorting, and imaginative play. The mixed shapes encourage children to test balance and create their own structures. Smooth wooden surfaces are pleasant for small hands to handle. The blocks support open-ended play at home, in nurseries, or in activity rooms.",
            category = ProductCategory.TOYS,
            price = 18.99,
            imageUrl = "https://images.unsplash.com/photo-1568828668638-b1b4014d91a2",
        ),
        Product(
            id = 11,
            title = "Teddy Bear",
            description = "A soft teddy bear made for cuddles, comfort, and pretend play. Its friendly shape is easy for a child to carry from room to room. Plush fabric makes it a cosy companion at bedtime or on journeys. The classic toy also makes a thoughtful gift for a young child.",
            category = ProductCategory.TOYS,
            price = 15.00,
            imageUrl = "https://images.unsplash.com/photo-1538292999061-16ca3647ab1c",
        ),
        Product(
            id = 12,
            title = "Jigsaw Puzzle",
            description = "A hands-on jigsaw puzzle for relaxed play and focused problem-solving. Fitting the pieces together encourages patience, observation, and fine motor skills. It can be enjoyed alone or shared around a table with family and friends. Pack the pieces away between sessions for repeat use.",
            category = ProductCategory.TOYS,
            price = 11.50,
            imageUrl = "https://images.unsplash.com/photo-1595110045856-a6addbdbcd8b",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
