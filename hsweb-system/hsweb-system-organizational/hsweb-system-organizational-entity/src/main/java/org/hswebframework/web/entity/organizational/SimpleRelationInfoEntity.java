package org.hswebframework.web.entity.organizational;
import org.hswebframework.web.commons.entity.SimpleGenericEntity;

/**
* 关系信息
* @author hsweb-generator-online
*/
public class SimpleRelationInfoEntity extends SimpleGenericEntity<String> implements RelationInfoEntity{
  		//关系从
        private String relationFrom;
  		//关系定义id
        private String relationId;
  		//关系至
        private String relationTo;
  		//关系类型从,如:人员
        private String relationTypeFrom;
  		//关系类型至,如:部门
        private String relationTypeTo;
  		//状态
        private Byte status;

        /**
        * @return  关系从
        */
        @Override
        public String getRelationFrom(){
			return this.relationFrom;
        }

        /**
        * @param  relationFrom  关系从
        */
        @Override
        public void setRelationFrom(String relationFrom){
        	this.relationFrom=relationFrom;
        }
        /**
        * @return  关系定义id
        */
        @Override
        public String getRelationId(){
			return this.relationId;
        }

        /**
        * @param  relationId  关系定义id
        */
        @Override
        public void setRelationId(String relationId){
        	this.relationId=relationId;
        }
        /**
        * @return  关系至
        */
        @Override
        public String getRelationTo(){
			return this.relationTo;
        }

        /**
        * @param  relationTo  关系至
        */
        @Override
        public void setRelationTo(String relationTo){
        	this.relationTo=relationTo;
        }
        /**
        * @return  关系类型从,如:人员
        */
        @Override
        public String getRelationTypeFrom(){
			return this.relationTypeFrom;
        }

        /**
        * @param  relationTypeFrom  关系类型从,如:人员
        */
        @Override
        public void setRelationTypeFrom(String relationTypeFrom){
        	this.relationTypeFrom=relationTypeFrom;
        }
        /**
        * @return  关系类型至,如:部门
        */
        @Override
        public String getRelationTypeTo(){
			return this.relationTypeTo;
        }

        /**
        * @param  relationTypeTo  关系类型至,如:部门
        */
        @Override
        public void setRelationTypeTo(String relationTypeTo){
        	this.relationTypeTo=relationTypeTo;
        }
        /**
        * @return  状态
        */
        @Override
        public Byte getStatus(){
			return this.status;
        }

        /**
        * @param  status  状态
        */
        @Override
        public void setStatus(Byte status){
        	this.status=status;
        }
}