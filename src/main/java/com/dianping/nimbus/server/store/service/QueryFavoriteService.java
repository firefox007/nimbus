package com.dianping.nimbus.server.store.service;

import java.util.List;

import javax.jdo.annotations.Transactional;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dianping.nimbus.server.store.domain.QueryFavorite;
import com.dianping.nimbus.server.store.persistence.QueryFavoriteMapper;

@Service
public class QueryFavoriteService {
	private static final Log logger = LogFactory.getLog(QueryFavoriteService.class);

	@Autowired
	private QueryFavoriteMapper queryFavoriteMapper;

	@Transactional
	public List<QueryFavorite> selectQueryFavoriteByUsername(String username) {
		List<QueryFavorite> queryFavoriteList = queryFavoriteMapper
				.selectQueryFavoriteByUsername(username);
		if (logger.isDebugEnabled()) {
			logger.debug(StringUtils.join(queryFavoriteList, ";"));
		}
		return queryFavoriteList;
	};

	@Transactional
	public void insertQueryFavorite(QueryFavorite queryFavorite){
		if (logger.isDebugEnabled()) {
			logger.debug("inserting QueryFavorite " + queryFavorite + " into database");
		}
		queryFavoriteMapper.insertQueryFavorite(queryFavorite);
		if (logger.isDebugEnabled()) { 
			logger.debug("inserted QueryFavorite " + queryFavorite + " into database");
		}
	};
}
