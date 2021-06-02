package com.lx.business.service.impl;

import com.lx.business.entity.Stock;
import com.lx.business.mapper.StockMapper;
import com.lx.business.service.StockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 销售库存表 服务实现类
 * </p>
 *
 * @author luxing
 * @since 2021-05-23
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements StockService {

}
