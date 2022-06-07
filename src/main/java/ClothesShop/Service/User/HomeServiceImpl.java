package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ClothesShop.Dao.CategorysDao;

import ClothesShop.Dao.MenusDao;
import ClothesShop.Dao.ProductsDao;
import ClothesShop.Dao.SlidesDao;
import ClothesShop.Dto.ProductsDto;
import ClothesShop.Entity.Categorys;
import ClothesShop.Entity.Menus;
import ClothesShop.Entity.Slides;

@Repository
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categoryDao;
	@Autowired
	private MenusDao menuDao;
	@Autowired
	private ProductsDao productsDao;
	public List<Slides> GetDataSlide() {
		
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		// TODO Auto-generated method stub
		return categoryDao.GetDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		// TODO Auto-generated method stub
		return menuDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return null;
	}
}
